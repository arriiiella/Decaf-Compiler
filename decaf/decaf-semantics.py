import antlr4 as ant
from DecafLexer import DecafLexer
from DecafParser import DecafParser
from DecafVisitor import DecafVisitor
from SymbolTable import HEAP, STACK, SymbolTable, VarSymbol, MethodSymbol

class DecafSemanticChecker(DecafVisitor):
    def __init__(self):
        super().__init__()
        self.st = SymbolTable()
        
    def visitProgram(self, ctx:DecafParser.ProgramContext):
        self.st.enterScope()
        self.visitChildren(ctx)
        self.st.exitScope()
        
    def visitField_decl(self, ctx:DecafParser.Field_declContext):
       line_num = ctx.start.line
       data_type = ctx.data_type().getText()
       
       field_count = len(ctx.field_name())
       for i in range (field_count):
           field_name = ctx.field_name(i).getText()          

           if ctx.field_name(i).int_literal() != None:
               array_size = int(ctx.field_name(i).int_literal().getText())
               if array_size <= 0:
                   print('Error on line', line_num, 'array declared with length 0')
           else:
               array_size = 1
               
           field_symbol = self.st.probe(field_name)

           if field_symbol != None:
               print('Error on line', line_num, 'field', field_name, 'is already declared on line', field_symbol.line)
           else:
               field_symbol = VarSymbol(id=field_name, 
                                        type=data_type, 
                                        line=line_num, 
                                        size=8 * array_size,
                                        mem=HEAP)
           
               self.st.addSymbol(field_symbol)
       
       self.visitChildren(ctx)
        
    def visitMethod_decl(self, ctx:DecafParser.Method_declContext):
        #create a method symbol
        #store a list of params in the method symbol
        #push method symbol with params list to global scope
        line_num = ctx.start.line
        method_name = ctx.ID(0).getText()
        method_type = ctx.return_type().getText()
        method_params = []
        
        self.st.enterScope()
        
        for i in range(len(ctx.data_type())):
            param_type = ctx.data_type(i).getText()
            param_name = ctx.ID(i+1).getText()
            param_symbol = VarSymbol(id=param_name, 
                                     type=param_type,
                                     line=line_num,
                                     size=8,
                                     mem=STACK)
            method_params.append(param_symbol)
            
        method_symbol = MethodSymbol(method_name, 
                                     method_type, 
                                     line_num, 
                                     method_params)
        self.visitChildren(ctx)
        self.st.addSymbol(method_symbol)
        self.st.exitScope()
        
    def visitExpr(self, ctx:DecafParser.ExprContext):
        if len(ctx.expr()) == 2:
            #root node
            type_a = self.visit(ctx.expr(0))
            type_b = self.visit(ctx.expr(1))

            if type_a != type_b:
                print('Error')
        elif ctx.location() != None:
            #in variable node
            pass
        elif ctx.literal() != None:
            #in literal node
            pass
        else:
            self.visitChildren(ctx)
        
filein = open('test.dcf', 'r')
lexer = DecafLexer(ant.InputStream(filein.read()))

stream = ant.CommonTokenStream(lexer)

parser = DecafParser(stream)
tree = parser.program()

visitor = DecafSemanticChecker()
visitor.visit(tree)

import java.lang.Integer;

class MyVisitor extends HelloBaseVisitor<Integer> {
    private int tabs = 0;
    private OutputWriter outputWriter;

    public MyVisitor() {
        outputWriter = new OutputWriter();
    }

    private void printTabs() {
        for (int i = 0; i < this.tabs; i++) {
            outputWriter.writeStringToFile("\t");
        }
    }

    @Override public Integer visitMain(HelloParser.MainContext ctx) {
        this.printTabs();
        outputWriter.writeStringToFile("<MainNode>" + "\n");
        this.tabs++;
        visit(ctx.stmt());
        this.tabs--;
        return 0;
    }

    @Override public Integer visitStmt(HelloParser.StmtContext ctx) {
        if (ctx.getChildCount() == 1){
            visit(ctx.getChild(0));
        }else {
            if (ctx.stmt() != null) {
                this.printTabs();
                outputWriter.writeStringToFile("<SequenceNode>" + "\n");
                this.tabs++;
                visit(ctx.getChild(0));
                visit(ctx.stmt());
                this.tabs--;
            } else {
                this.printTabs();
                outputWriter.writeStringToFile("<SequenceNode>" + "\n");
                this.tabs++;
                visit(ctx.getChild(0));
                visit(ctx.getChild(1));
                this.tabs--;
            }
        }
        return 0;
    }

    @Override public Integer visitEqual(HelloParser.EqualContext ctx) {
        this.printTabs();
        outputWriter.writeStringToFile("<AssignmentNode> =" + "\n");
        this.tabs++;
        visit(ctx.var());
        visit(ctx.aexpr());
        this.tabs--;
        return 0;
    }

    @Override public Integer visitWhhile(HelloParser.WhhileContext ctx){
        this.printTabs();
        outputWriter.writeStringToFile("<WhileNode> while" + "\n");
        this.tabs++;
        visit(ctx.conditie);
        visit(ctx.bloc);
        this.tabs--;
        return 0;
    }

    @Override public Integer visitIff(HelloParser.IffContext ctx){
        this.printTabs();
        outputWriter.writeStringToFile("<IfNode> if" + "\n");
        this.tabs++;
        visit(ctx.conditie);
        visit(ctx.first);
        visit(ctx.second);
        this.tabs--;
        return 0;
    }

    @Override public Integer visitBlock(HelloParser.BlockContext ctx){
        this.printTabs();
        outputWriter.writeStringToFile("<BlockNode> {}" + "\n");
        this.tabs++;

        if(ctx.getChildCount() > 1){
           visit(ctx.getChild(1));
        }
        this.tabs--;
        return 0;
    }

    @Override public Integer visitBexpr(HelloParser.BexprContext ctx) {

        if(ctx.bval() != null){
            visit(ctx.bval());
        }

        if(ctx.getChildCount() == 3 && ctx.getChild(1).getText().equals("&&")){
            this.printTabs();
            outputWriter.writeStringToFile("<AndNode> &&" + "\n");
            this.tabs++;
            visit(ctx.first);
            visit(ctx.second);
            this.tabs--;
        }

        if(ctx.getChildCount() == 3 && ctx.getChild(1).getText().equals(">")){
            this.printTabs();
            outputWriter.writeStringToFile("<GreaterNode> >" + "\n");
            this.tabs++;
            visit(ctx.left);
            visit(ctx.right);
            this.tabs--;
        }

        if(ctx.getChild(0).getText().equals("!")){
            this.printTabs();
            outputWriter.writeStringToFile("<NotNode> !" + "\n");
            this.tabs++;
            visit(ctx.getChild(1));
            this.tabs--;
        }

        if(ctx.getChild(0).getText().equals("(")){
            this.printTabs();
            outputWriter.writeStringToFile("<BracketNode> ()" + "\n");
            this.tabs++;
            visit(ctx.getChild(1));
            this.tabs--;
        }

        return 0;
    }

    @Override public Integer visitAexpr(HelloParser.AexprContext ctx) {
        if(ctx.var() != null){
            visit(ctx.var());
        }

        if(ctx.aval() != null){
            visit(ctx.aval());
        }

        if(ctx.getChildCount() == 3 && ctx.getChild(1).getText().equals("+")){
            this.printTabs();
            outputWriter.writeStringToFile("<PlusNode> +" + "\n");
            this.tabs++;
            visit(ctx.left);
            visit(ctx.rigth);
            this.tabs--;
        }

        if(ctx.getChildCount() == 3 && ctx.getChild(1).getText().equals("/")){
            this.printTabs();
            outputWriter.writeStringToFile("<DivNode> /" + "\n");
            this.tabs++;
            visit(ctx.left);
            visit(ctx.rigth);
            this.tabs--;
        }

        if(ctx.getChild(0).getText().equals("(")){
            this.printTabs();
            outputWriter.writeStringToFile("<BracketNode> ()" + "\n");
            this.tabs++;
            visit(ctx.getChild(1));
            this.tabs--;
        }

        return 0;
    }

    @Override public Integer visitVar(HelloParser.VarContext ctx) {
        this.printTabs();
        outputWriter.writeStringToFile("<VariableNode> " + ctx.getText() + "\n");
        return 0;
    }

    @Override public Integer visitAval(HelloParser.AvalContext ctx) {
        this.printTabs();
        outputWriter.writeStringToFile("<IntNode> " + ctx.getText() + "\n");
        return 0;
    }

    @Override public Integer visitBval(HelloParser.BvalContext ctx) {
        this.printTabs();
        outputWriter.writeStringToFile("<BoolNode> " + ctx.getText() + "\n");
        return 0;
    }
}

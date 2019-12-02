package pnp.compiler.model.construct.statement;

import pnp.compiler.model.construct.Block;
import pnp.compiler.model.construct.type.Type;
import pnp.compiler.model.construct.type.primitives.PrimitiveType;
import pnp.compiler.model.expression.Expression;

public class WhileStatement extends Statement {
    private Block block;
    private Expression condition;

    public WhileStatement(Expression condition) {
        this.block = new StatementBlock();
        this.condition = condition;
    }

    @Override
    public Type getType() {
        return PrimitiveType.Booleano;
    }

    public Block getWhileBlock() {
        return this.block;
    }

    public Expression getCondition() {
        return this.condition;
    }
}

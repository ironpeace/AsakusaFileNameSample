package ironpeace.operator;
import com.asakusafw.vocabulary.flow.Operator;
import com.asakusafw.vocabulary.flow.Source;
import com.asakusafw.vocabulary.flow.graph.FlowElementResolver;
import com.asakusafw.vocabulary.flow.graph.ObservationCount;
import com.asakusafw.vocabulary.flow.graph.OperatorDescription;
import com.asakusafw.vocabulary.operator.OperatorFactory;
import com.asakusafw.vocabulary.operator.OperatorInfo;
import com.asakusafw.vocabulary.operator.Update;
import ironpeace.modelgen.dmdl.model.ExSampleModel;
import javax.annotation.Generated;
/**
 * {@link SampleOperator}に関する演算子ファクトリークラス。
 * @see SampleOperator
 */
@Generated("OperatorFactoryClassGenerator:0.0.1")@OperatorFactory(SampleOperator.class) public class 
        SampleOperatorFactory {
    /**
     */
    public static final class Updated implements Operator {
        private final FlowElementResolver $;
        /**
         * 結果
         */
        public final Source<ExSampleModel> out;
        Updated(Source<ExSampleModel> ex) {
            OperatorDescription.Builder builder = new OperatorDescription.Builder(Update.class);
            builder.declare(SampleOperator.class, SampleOperatorImpl.class, "updated");
            builder.declareParameter(ExSampleModel.class);
            builder.addInput("ex", ex);
            builder.addOutput("out", ex);
            builder.addAttribute(ObservationCount.DONT_CARE);
            this.$ = builder.toResolver();
            this.$.resolveInput("ex", ex);
            this.out = this.$.resolveOutput("out");
        }
        /**
         * この演算子の名前を設定する。
         * @param newName 設定する名前
         * @return この演算子オブジェクト (this)
         * @throws IllegalArgumentException 引数に{@code null}が指定された場合
         */
        public SampleOperatorFactory.Updated as(String newName) {
            this.$.setName(newName);
            return this;
        }
    }
    /**
     * @param ex
     * @return 生成した演算子オブジェクト
     * @see SampleOperator#updated(ExSampleModel)
     */
    @OperatorInfo(kind = Update.class, input = {@OperatorInfo.Input(name = "ex", type = ExSampleModel.class, position = 
                0)}, output = {@OperatorInfo.Output(name = "out", type = ExSampleModel.class)}, parameter = {}) public 
            SampleOperatorFactory.Updated updated(Source<ExSampleModel> ex) {
        return new SampleOperatorFactory.Updated(ex);
    }
}
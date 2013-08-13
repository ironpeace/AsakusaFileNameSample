package ironpeace.batchapp.fnsBatch.sampleJobFlow.directio.epilogue;
/**
 */
public final class ShuffleGroupingComparator extends com.asakusafw.runtime.io.util.ShuffleKey.AbstractGroupComparator {
    /**
     * Creates a new instance.
     */
    public ShuffleGroupingComparator() {
        super(ShuffleKey.class);
    }
}
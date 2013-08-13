package ironpeace.modelgen.dmdl.model;
import com.asakusafw.runtime.model.DataModel;
import com.asakusafw.runtime.model.DataModelKind;
import com.asakusafw.runtime.model.ModelInputLocation;
import com.asakusafw.runtime.model.ModelOutputLocation;
import com.asakusafw.runtime.model.PropertyOrder;
import com.asakusafw.runtime.value.StringOption;
import ironpeace.modelgen.dmdl.io.ExSampleModelInput;
import ironpeace.modelgen.dmdl.io.ExSampleModelOutput;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.io.Writable;
/**
 * ex_sample_modelを表すデータモデルクラス。
 */
@DataModelKind("DMDL")@ModelInputLocation(ExSampleModelInput.class)@ModelOutputLocation(ExSampleModelOutput.class)@
        PropertyOrder({"file_name", "keycode", "data01", "term"}) public class ExSampleModel implements DataModel<
        ExSampleModel>, Writable {
    private final StringOption fileName = new StringOption();
    private final StringOption keycode = new StringOption();
    private final StringOption data01 = new StringOption();
    private final StringOption term = new StringOption();
    @Override@SuppressWarnings("deprecation") public void reset() {
        this.fileName.setNull();
        this.keycode.setNull();
        this.data01.setNull();
        this.term.setNull();
    }
    @Override@SuppressWarnings("deprecation") public void copyFrom(ExSampleModel other) {
        this.fileName.copyFrom(other.fileName);
        this.keycode.copyFrom(other.keycode);
        this.data01.copyFrom(other.data01);
        this.term.copyFrom(other.term);
    }
    /**
     * file_nameを返す。
     * @return file_name
     * @throws NullPointerException file_nameの値が<code>null</code>である場合
     */
    public Text getFileName() {
        return this.fileName.get();
    }
    /**
     * file_nameを設定する。
     * @param value 設定する値
     */
    @SuppressWarnings("deprecation") public void setFileName(Text value) {
        this.fileName.modify(value);
    }
    /**
     * <code>null</code>を許すfile_nameを返す。
     * @return file_name
     */
    public StringOption getFileNameOption() {
        return this.fileName;
    }
    /**
     * file_nameを設定する。
     * @param option 設定する値、<code>null</code>の場合にはこのプロパティが<code>null</code>を表すようになる
     */
    @SuppressWarnings("deprecation") public void setFileNameOption(StringOption option) {
        this.fileName.copyFrom(option);
    }
    /**
     * keycodeを返す。
     * @return keycode
     * @throws NullPointerException keycodeの値が<code>null</code>である場合
     */
    public Text getKeycode() {
        return this.keycode.get();
    }
    /**
     * keycodeを設定する。
     * @param value 設定する値
     */
    @SuppressWarnings("deprecation") public void setKeycode(Text value) {
        this.keycode.modify(value);
    }
    /**
     * <code>null</code>を許すkeycodeを返す。
     * @return keycode
     */
    public StringOption getKeycodeOption() {
        return this.keycode;
    }
    /**
     * keycodeを設定する。
     * @param option 設定する値、<code>null</code>の場合にはこのプロパティが<code>null</code>を表すようになる
     */
    @SuppressWarnings("deprecation") public void setKeycodeOption(StringOption option) {
        this.keycode.copyFrom(option);
    }
    /**
     * data01を返す。
     * @return data01
     * @throws NullPointerException data01の値が<code>null</code>である場合
     */
    public Text getData01() {
        return this.data01.get();
    }
    /**
     * data01を設定する。
     * @param value 設定する値
     */
    @SuppressWarnings("deprecation") public void setData01(Text value) {
        this.data01.modify(value);
    }
    /**
     * <code>null</code>を許すdata01を返す。
     * @return data01
     */
    public StringOption getData01Option() {
        return this.data01;
    }
    /**
     * data01を設定する。
     * @param option 設定する値、<code>null</code>の場合にはこのプロパティが<code>null</code>を表すようになる
     */
    @SuppressWarnings("deprecation") public void setData01Option(StringOption option) {
        this.data01.copyFrom(option);
    }
    /**
     * termを返す。
     * @return term
     * @throws NullPointerException termの値が<code>null</code>である場合
     */
    public Text getTerm() {
        return this.term.get();
    }
    /**
     * termを設定する。
     * @param value 設定する値
     */
    @SuppressWarnings("deprecation") public void setTerm(Text value) {
        this.term.modify(value);
    }
    /**
     * <code>null</code>を許すtermを返す。
     * @return term
     */
    public StringOption getTermOption() {
        return this.term;
    }
    /**
     * termを設定する。
     * @param option 設定する値、<code>null</code>の場合にはこのプロパティが<code>null</code>を表すようになる
     */
    @SuppressWarnings("deprecation") public void setTermOption(StringOption option) {
        this.term.copyFrom(option);
    }
    @Override public String toString() {
        StringBuilder result = new StringBuilder();
        result.append("{");
        result.append("class=ex_sample_model");
        result.append(", fileName=");
        result.append(this.fileName);
        result.append(", keycode=");
        result.append(this.keycode);
        result.append(", data01=");
        result.append(this.data01);
        result.append(", term=");
        result.append(this.term);
        result.append("}");
        return result.toString();
    }
    @Override public int hashCode() {
        int prime = 31;
        int result = 1;
        result = prime * result + fileName.hashCode();
        result = prime * result + keycode.hashCode();
        result = prime * result + data01.hashCode();
        result = prime * result + term.hashCode();
        return result;
    }
    @Override public boolean equals(Object obj) {
        if(this == obj) {
            return true;
        }
        if(obj == null) {
            return false;
        }
        if(this.getClass() != obj.getClass()) {
            return false;
        }
        ExSampleModel other = (ExSampleModel) obj;
        if(this.fileName.equals(other.fileName) == false) {
            return false;
        }
        if(this.keycode.equals(other.keycode) == false) {
            return false;
        }
        if(this.data01.equals(other.data01) == false) {
            return false;
        }
        if(this.term.equals(other.term) == false) {
            return false;
        }
        return true;
    }
    /**
     * file_nameを返す。
     * @return file_name
     * @throws NullPointerException file_nameの値が<code>null</code>である場合
     */
    public String getFileNameAsString() {
        return this.fileName.getAsString();
    }
    /**
     * file_nameを設定する。
     * @param fileName0 設定する値
     */
    @SuppressWarnings("deprecation") public void setFileNameAsString(String fileName0) {
        this.fileName.modify(fileName0);
    }
    /**
     * keycodeを返す。
     * @return keycode
     * @throws NullPointerException keycodeの値が<code>null</code>である場合
     */
    public String getKeycodeAsString() {
        return this.keycode.getAsString();
    }
    /**
     * keycodeを設定する。
     * @param keycode0 設定する値
     */
    @SuppressWarnings("deprecation") public void setKeycodeAsString(String keycode0) {
        this.keycode.modify(keycode0);
    }
    /**
     * data01を返す。
     * @return data01
     * @throws NullPointerException data01の値が<code>null</code>である場合
     */
    public String getData01AsString() {
        return this.data01.getAsString();
    }
    /**
     * data01を設定する。
     * @param data010 設定する値
     */
    @SuppressWarnings("deprecation") public void setData01AsString(String data010) {
        this.data01.modify(data010);
    }
    /**
     * termを返す。
     * @return term
     * @throws NullPointerException termの値が<code>null</code>である場合
     */
    public String getTermAsString() {
        return this.term.getAsString();
    }
    /**
     * termを設定する。
     * @param term0 設定する値
     */
    @SuppressWarnings("deprecation") public void setTermAsString(String term0) {
        this.term.modify(term0);
    }
    @Override public void write(DataOutput out) throws IOException {
        fileName.write(out);
        keycode.write(out);
        data01.write(out);
        term.write(out);
    }
    @Override public void readFields(DataInput in) throws IOException {
        fileName.readFields(in);
        keycode.readFields(in);
        data01.readFields(in);
        term.readFields(in);
    }
}
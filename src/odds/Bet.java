
package odds;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Bet {

    @SerializedName("values")
    @Expose
    private List<Value> values = null;
    @SerializedName("label_name")
    @Expose
    private String labelName;
    @SerializedName("label_id")
    @Expose
    private int labelId;

    public List<Value> getValues() {
        return values;
    }

    public void setValues(List<Value> values) {
        this.values = values;
    }

    public String getLabelName() {
        return labelName;
    }

    public void setLabelName(String labelName) {
        this.labelName = labelName;
    }

    public int getLabelId() {
        return labelId;
    }

    public void setLabelId(int labelId) {
        this.labelId = labelId;
    }

}

package boxtetris.restservice.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class LayerBuilderSettings {
    private final Integer cuboidsInRow;
    private final Integer rowsInLayer;

    public LayerBuilderSettings(@JsonProperty("cuboidsInRow") Integer cuboidsInRow,
            @JsonProperty("rowsInLayer") Integer rowsInLayer) {
        this.cuboidsInRow = cuboidsInRow;
        this.rowsInLayer = rowsInLayer;
    }

    
    /** 
     * @return Integer
     */
    public Integer getCuboidsInRow() {
        return cuboidsInRow;
    }

    
    /** 
     * @return Integer
     */
    public Integer getRowsInLayer() {
        return rowsInLayer;
    }
}
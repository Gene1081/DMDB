import java.util.HashMap;
import java.util.Map;

public class FieldMapper {

    private Map<String, String> fieldMap;

    public FieldMapper() {
        fieldMap = new HashMap<>();
    }

    public void addMapping(String sourceField, String destinationField) {
        fieldMap.put(sourceField, destinationField);
    }

    public String getDestinationField(String sourceField) {
        return fieldMap.get(sourceField);
    }

    public static void main(String[] args) {
        FieldMapper mapper = new FieldMapper();

        // 添加字段映射
        mapper.addMapping("sourceField1", "destinationField1");
        mapper.addMapping("sourceField2", "destinationField2");

        // 获取目标字段
        String destinationField1 = mapper.getDestinationField("sourceField1");
        String destinationField2 = mapper.getDestinationField("sourceField2");
        String destinationField3 = mapper.getDestinationField("sourceField3");

        System.out.println("Destination field for sourceField1: " + destinationField1);
        System.out.println("Destination field for sourceField2: " + destinationField2);
        System.out.println("Destination field for sourceField3: " + destinationField3);
    }
}

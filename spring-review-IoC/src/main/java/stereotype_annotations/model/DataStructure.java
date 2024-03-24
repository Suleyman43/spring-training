package stereotype_annotations.model;

import lombok.Data;
import lombok.NonNull;
import org.springframework.stereotype.Component;
import stereotype_annotations.model.ExtraHours;

@Component
@Data
public class DataStructure {

    @NonNull
    private ExtraHours extraHours;

    public void getTotalHours(){
        System.out.println("Total hours: "+ (45+ extraHours.getHours()));
    }
}

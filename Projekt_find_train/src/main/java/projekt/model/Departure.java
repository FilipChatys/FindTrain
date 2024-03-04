package projekt.model;


import lombok.Data;
import org.hibernate.annotations.CacheConcurrencyStrategy;
import org.springframework.validation.annotation.Validated;
import javax.persistence.*;
import java.sql.Time;
import java.util.Date;

@Validated
@Data
@org.hibernate.annotations.Cache(usage = CacheConcurrencyStrategy.READ_WRITE)


@Entity
@Table(name = "departures")
public class Departure {

    @Column(name = "id")
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int id;

    @Column(name = "startOfTrip")
    private String startOfTrip;

    @Column(name = "endOfTrip")
    private String endOfTrip;

    @Column(name = "dateOfStart")
    private String dateOfStart;

    @Column(name = "timeOfStart")
    private String timeOfStart;

    @Column(name = "trainNumber")
    private String trainNumber;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStartOfTrip() {
        return startOfTrip;
    }

    public void setStartOfTrip(String startOfTrip) {
        this.startOfTrip = startOfTrip;
    }

    public String getEndOfTrip() {
        return endOfTrip;
    }

    public void setEndOfTrip(String endOfTrip) {
        this.endOfTrip = endOfTrip;
    }

    public String getDateOfStart() {
        return dateOfStart;
    }

    public void setDateOfStart(String dateOfStart) {
        this.dateOfStart = dateOfStart;
    }

    public String getTimeOfStart() {
        return timeOfStart;
    }
    public void setTimeOfStart(String timeOfStart) {
        this.timeOfStart = timeOfStart;
    }

    public String getTrainNumber(){
        return trainNumber;
    }

    public void setTrainNumber(String trainNumber){
        this.trainNumber = trainNumber;
    }



    @Override
    public String toString() {
        return "Departure{" +
                "startOfTrip=" + id +
                ", endOfTrip='" + endOfTrip + '\'' +
                ", startOfTrip='" + startOfTrip + '\'' +
                ", dateOfStart='" + dateOfStart + '\'' +
                ", timeOfStart='" + timeOfStart + '\'' +
                ", trainNumber='" + timeOfStart + '\'' +
                '}';
    }
}
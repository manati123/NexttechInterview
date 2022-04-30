import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@ToString
public class Action {
    String action;
    String actorIBAN;
    Date happenedIn;
    TransactionType type;
}

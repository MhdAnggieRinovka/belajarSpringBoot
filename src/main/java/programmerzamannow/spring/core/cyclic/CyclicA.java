package programmerzamannow.spring.core.cyclic;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class CyclicA {

    private CyclicB cyclicB;
}

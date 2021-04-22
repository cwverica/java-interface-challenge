package info.caseyverica;

import java.util.List;

public interface ISaveable {
    void read(List<String> savedValues);
    List<String> write();
}

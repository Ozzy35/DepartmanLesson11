package Lesson14AnotasyonlarGenericTiplerAkislarStreams.Annotations;

import java.util.List;

public class Machine {
    private List versions;

    @SuppressWarnings("unchecked")
    public void addVersion(String version) {
        versions.add(version);
    }
}
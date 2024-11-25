package number_11;

import java.util.HashMap;
import java.util.Map;

// Реестр отчетов (упрощает доступ к прототипам)
public class ReportRegistry {
    private final Map<String, Report> prototypes = new HashMap<>();

    public void register(String key, Report report) {
        prototypes.put(key, report);
    }

    public Report getReport(String key) {
        Report report = prototypes.get(key);
        if (report != null) {
            return report.clone();
        }
        throw new IllegalArgumentException("Отчет с ключом \"" + key + "\" не найден.");
    }
}
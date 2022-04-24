package MediaWiki;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;


public class Dates {
    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

    public List<LocalDate> getDateList(LocalDate startDate, LocalDate endDate) {
        return startDate.datesUntil(endDate)
                .collect(Collectors.toList());
    }

    public List<Long> toEpochList(List<LocalDate> dateList) throws Exception {
        List<Long> epochList = new ArrayList<>();
        for (LocalDate localDate : dateList) {
            epochList.add(dateFormat.parse(String.valueOf(localDate)).getTime());
        }
        return epochList;
    }

    public List<String> toDateList(List<Long> epochList) {
        List<String> dateList = new ArrayList<>();
        for (Long epochDate : epochList) {
            dateList.add(dateFormat.format(new Date(Long.parseLong(String.valueOf(epochDate)))));
        }
        return dateList;
    }
}

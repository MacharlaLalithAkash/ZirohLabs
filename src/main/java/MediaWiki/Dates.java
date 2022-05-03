package MediaWiki;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

/*
Dates class is responsible for all the date manipulation tasks
 */

public class Dates {
    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

    // Normal Date(YYYY-MM-DD) is converted into Epoch Date
    public long toEpoch(String date) throws Exception {
        return dateFormat.parse(String.valueOf(date)).getTime();
    }

    // Epoch Date is converted into Normal Date(YYYY-MM-DD)
    public String toDate(long epochDate) {
        return dateFormat.format(new Date(Long.parseLong(String.valueOf(epochDate))));
    }

    //Returns List of Dates between two dates
    public List<LocalDate> getDateList(LocalDate startDate, LocalDate endDate) {
        return startDate.datesUntil(endDate)
                .collect(Collectors.toList());
    }

    // Normal Date(YYYY-MM-DD) List is converted into Epoch Date List
    public List<Long> toEpochList(List<LocalDate> dateList) throws Exception {
        List<Long> epochList = new ArrayList<>();
        for (LocalDate localDate : dateList) {
            epochList.add(dateFormat.parse(String.valueOf(localDate)).getTime());
        }
        return epochList;
    }

    // Epoch Date List is converted into Normal Date(YYYY-MM-DD) List
    public List<String> toDateList(List<Long> epochList) {
        List<String> dateList = new ArrayList<>();
        for (Long epochDate : epochList) {
            dateList.add(dateFormat.format(new Date(Long.parseLong(String.valueOf(epochDate)))));
        }
        return dateList;
    }
}

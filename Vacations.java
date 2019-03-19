package _11_Urlopy;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static _11_Urlopy.Employees.*;

public class Vacations {

    public static final Vacation vacation1 = new Vacation(ANNA, LocalDate.of(2019, 02, 14),LocalDate.of(2019, 02, 16));
    public static final Vacation vacation2 = new Vacation(BASIA, LocalDate.of(2019, 02, 15),LocalDate.of(2019, 03, 02));
    public static final Vacation vacation3 = new Vacation(KASIA, LocalDate.of(2019, 04, 05),LocalDate.of(2019, 05, 02));
    public static final Vacation vacation4 = new Vacation(ZDZISIEK, LocalDate.of(2019, 03, 18),LocalDate.of(2019, 04, 15));

List<Vacation> VACATIONS = Arrays.asList(vacation1, vacation2, vacation3, vacation4);
}

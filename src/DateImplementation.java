import java.time.LocalDate;

public class DateImplementation implements SomeInterface<LocalDate> {
    private LocalDate currentDate;
    @Override
    public LocalDate getData() {
        return null;
    }

    @Override
    public boolean validate(LocalDate date) {
        return false;
    }
    public boolean validate(String date){
        return false;
    }
}

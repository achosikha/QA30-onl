package lesson_12_collections_2.subclasses;

public class BlueColorWorker extends Person implements BlueColorWorkerDuties{
    public BlueColorWorker(String name, String surname, int age, String position, long mobilePhone) {
        super(name, surname, age, position, mobilePhone);
    }

    @Override
    public void putTask() {
        // CODE
    }

    @Override
    public void getTaskImplementationNotification() {
        // CODE
    }
}
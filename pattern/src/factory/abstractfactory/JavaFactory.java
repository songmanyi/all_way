package factory.abstractfactory;

public class JavaFactory implements ICourseFactory {
    @Override
    public ICourse createCourse() {
        return new JavaCourse();
    }

    @Override
    public INote createNote() {
        return new JavaNote();
    }

    @Override
    public IVedio createVedio() {
        return new JavaVedio();
    }
}

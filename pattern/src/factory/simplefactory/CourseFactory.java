package factory.simplefactory;

public class CourseFactory implements ICourseFactory {

    @Override
    public ICourse create(Class clazz) {
        if (clazz != null) {
            try {
                return (ICourse) clazz.newInstance();
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
        return null;
    }
}

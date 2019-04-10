package templatemethod.course;

public abstract class NetworkCourse {

    protected final void createCourse() {
        // 1、发布预习资料
        postPreResource();
        // 2、制作ppt
        createPPT();
        // 3、提交课件
        postNote();
        // 4、布置作业
        // 如果有作业需要检查作业，如果没作业，就完成
        if (neddHomeWork()) {
            checkHomeWork();
        }
    }

    protected abstract void checkHomeWork();

    // 钩子方法，留给子类来可以改变流程
    protected boolean neddHomeWork() {
        return false;
    }

    final void postNote() {
        System.out.println("提交课件");
    }

    final void createPPT() {
        System.out.println("创建PPT");
    }

    final void postPreResource() {
        System.out.println("分发预习资料");
    }

}

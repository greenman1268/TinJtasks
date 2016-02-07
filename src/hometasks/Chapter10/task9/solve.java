package hometasks.Chapter10.task9;

/**
 * Created by Admin on 06.02.2016.
 */
interface solve {
    solve method();
}
 class yo{

        class Inner implements solve{

            @Override
            public solve method() {
                solve s = new Inner();
                return s;

            }
        }

}

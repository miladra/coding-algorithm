package linkedin;

public class child {

        void run2() {
            child2 cc = new child2();
            cc.message2();
        }

        public class child2 extends finalclass {

            public void message2() {
                message1();
            }
        }
        void message1() {
            System.out.print("wewewef");
        }
    }



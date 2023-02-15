package classTest;

class BuilderTest {
    int A;
    String S;
    int B;
    private BuilderTest(int A, String S, int B){
        this.A=A;
        this.S=S;
        this.B=B;
    }

    public void printData(){
        System.out.println(A+S+A+S+B);
    }

    public static class Builder {
        int A=0;
        int B=0;
        String S=null;

        public Builder(){

        }

        public Builder intBuild(int A){
            this.A = A;
            System.out.println(A+S);
            return this;
        }
        public Builder intBuild2(int B){
            this.B = B;
            System.out.println(B+S);
            return this;
        }


        public Builder strBuild(String S){
            this.S = S;
            System.out.println(A+S);
            return this;
        }

        public BuilderTest build(){
            System.out.println(A+S);
            return new BuilderTest(A, S, B);
        }

    }

}

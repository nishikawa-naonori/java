    class Triangle{
        public int line1;
        public int line2;
        public int line3;
        Triangle(int l1 , int l2 , int l3){ line1 = l1; line2 = l2 ; line3 = l3 ; }

        public static void main(String[] args) {
           
            }

    public static int countSameTriangle(Triangle[] sample, Triangle ref) {
        int cnt = 0;
        for(Triangle t : sample) {

        if(t.line1 + t.line2 + t.line3 == ref.line1 + ref.line2 + ref.line3) {
          if(t.line1 == ref.line1) {
            cnt += t.line2 == ref.line2 || t.line2 == ref.line3 ? 1 : 0;
          } else if(t.line1 == ref.line2) {
            cnt += t.line2 == ref.line1 || t.line2 == ref.line3 ? 1 : 0;
          } else if(t.line1 == ref.line3) {
            cnt += t.line2 == ref.line1 || t.line2 == ref.line2 ? 1 : 0;
          }
        }
        }
        return cnt;
        }
        }
        
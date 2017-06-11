import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


/** Class for buffered reading int and double values */
class Reader {
    static BufferedReader reader;
    static StringTokenizer tokenizer;

    /** call this method to initialize reader for InputStream */
    static void init(InputStream input) {
        reader = new BufferedReader(
                     new InputStreamReader(input) );
        tokenizer = new StringTokenizer("");
    }

    /** get next word */
    static String next() throws IOException {
        while ( ! tokenizer.hasMoreTokens() ) {
            //TODO add check for eof if necessary
            tokenizer = new StringTokenizer(
                   reader.readLine() );
        }
        return tokenizer.nextToken();
    }

    static int nextInt() throws IOException {
        return Integer.parseInt( next() );
    }
	
    static double nextDouble() throws IOException {
        return Double.parseDouble( next() );
    }
}
public class Books {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		Reader.init(System.in);
		int p=(int)Reader.nextInt();
		int y=num(p);
		
		System.out.println(y);
	}
	//static int count=0;
	static int co=0;
	static int i=1;
	static int b=0;
	static int h;
	static int f=(int)Math.log10((double)h);;
	static int [] n=placevalue(h);
	
 public static int num(int a){
	  
	 // for(int c=1;c<f;c++){
	 if(i==f+1||a<10){
		 
		 return co+Math.abs(b-a)*(f+1);
	 }
	 else{
		 
			 
			// System.out.println(n[0]);
		 b=(n[f-i]*(int)Math.pow((double)10,i-1));
		 co=co+b*i;
		 i++;
		 h=a;
		 return num(a);}
	  //}
		 //return co;
	 
 } static int l;
	 public static int[] placevalue(int k){
		 int g=(int)Math.log10((double)k)+1;
		 int[]place=new int[g];
	 if(k<10&&l==0){
		 place[0]=k;
	 }else{
		 int u=k%10;
		 l=g-1;
		 place[l]=u;
		 l--;
		 return placevalue(k/10);
	 }
	 return place;
	  }
}

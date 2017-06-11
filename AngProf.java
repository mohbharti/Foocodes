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
public class AngProf {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		Reader.init(System.in);
		int a=Reader.nextInt();
		for(int i=0;i<a;i++){
			int h=Reader.nextInt();
			int y=Reader.nextInt();
			int sum=0;
			for(int j=0;j<h;j++){
				int l=Reader.nextInt();
				if(l<=0){
					sum++;
				}
				else{
					sum=sum+0;
				}
			}
			if(ToBit(sum)>=y){
				System.out.println("No");
			}
			else{
				System.out.println("Yes");
			}
		}
	}
	public static int  ToBit(int a ) {
		int count=0;	
while(Math.abs(a)>0){
	if (a%2==1)
		count+=1;
		a=Math.abs(a/2);
		 
	}
	//System.out.println(count);
	return count;
}


}

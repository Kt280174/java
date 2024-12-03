
public class Main
{   
	public static void main(String[] args) {
    int i = 0;
    
    //break
    while(i < 10){
        i++;
        if(i == 5){
            break;
        }
    }
    
    //continue
    while(i < 10){
        i++;
        if(i%2 == 0){
            continue;
        }
    }
	}
}
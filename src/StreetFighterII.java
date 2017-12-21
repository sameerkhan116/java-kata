import java.util.*;
public class StreetFighterII {
 
    public static String[] superStreetFighterize(String[][] f, int[] pos, String[] moves){
     String[] res=new String[moves.length];
     int i=0;
     for (String s:moves){
         pos[0]= s=="up"&&pos[0]!=0? pos[0]-1:pos[0];
         pos[0]= f[pos[0]][pos[1]]==""? pos[0]+1: pos[0];
         
         pos[0]= s=="down"&&pos[0]!=f.length-1? pos[0]+1:pos[0];
         pos[0]= f[pos[0]][pos[1]]==""? pos[0]-1: pos[0];
         
         do{
         pos[1]= s=="left"&&pos[1]!=0 ? pos[1]-1: s=="left"&&pos[1]==0 ? f[pos[0]].length-1: pos[1];
         pos[1]= s=="right"&&pos[1]<f[pos[0]].length-1 ? pos[1]+1: s=="right"&&pos[1]==f[pos[0]].length-1 ? 0: pos[1];
         }while(f[pos[0]][pos[1]]=="");
         
         res[i]=f[pos[0]][pos[1]];
         i++;
     }
    return res;
  }
 
}
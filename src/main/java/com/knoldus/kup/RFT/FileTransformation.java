package com.knoldus.kup.RFT;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;

public class FileTransformation{
    public static void main(String[] args) throws Exception {
        System.out.println("Compiled by Ranu Rajput");
        File file =new File("src/main/java/com/knoldus/kup/RFT/Text.txt");
        Map<String, String> map = new HashMap<String,String>();
        BufferedReader br = new BufferedReader(new FileReader(file));
        String str="";

        while((str=br.readLine())!=null){

            String words[]=str.split(" ");
            for(int i=0;i<words.length;i++){
                if(map.containsKey(words[i])){
                    Integer n= Integer.parseInt(map.get(words[i]));
                    n++;
                    map.replace(words[i], map.get(words[i]), ""+n);
                }
                else{
                    map.put(words[i],"1");
                }
            }
        }
        System.out.println("Output of file transformation : ");
        System.out.println(map);
        br.close();
    }
}
/*
output-->
Compiled by Ranu Rajput
Output of file transformation :
{=1, very=1, data=1, don't=1, used=1, program=1, iterate,=1, lambda=2, saves=1, concise=1, create=1, This=1, from=1, has=1, write=1, case=1, which=2, new=1, treated=1, using=1, method=2, in=2, need=1, is=5, collection=1, an=2, interface.=1, .class=1, Compiled=1, important=1, as=1, extract=1, provide=1, Here,=1, helps=1, useful=1, functional=1, providing=1, Rajput=1, In=1, code.=2, for=1, It=4, function,=1, interface=2, we=2, library.=1, collection.=1, The=1, lot=1, SE=1, not=1, feature=1, and=3, provides=1, does=1, of=4, by=1, define=1, so=1, compiler=1, Lambda=2, included=1, just=1, expression.=1, a=4, Java=3, expression,=1, expression=3, implementation.=1, one=1, implementation=2, again=1, was=1, clear=1, way=1, filter=1, the=4, Ranu=1, 8.=1, to=4, file.=1, represent=1}
 */
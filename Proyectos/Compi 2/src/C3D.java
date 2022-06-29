public class C3D {
    int rets[];
    public  String code;
    int variables[];
    public String C3D(){
        for(int i = 0; i < rets.length; i++){
            for(int j = 0; j < variables.length; j++){
                if(variables[j]+"name" == rets[i]+"variable"){
                    this.code = this.code + "STACK_FUNC[SF]"
                     + variables[j]+"temp";
                    String SF = "SF" + "1";
                    String new_rets = rets[i]+"function";
                    String SF2 = "SF" + variables[j];
                }
            }

        }
        return "";
    }


}

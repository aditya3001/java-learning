package com.practice.dynamicProgramming;

public class MaximumOccurences {
	public static void main(String[] args) {
		String S = "qghumeaylnlfdxfircvscxggbwkfnqduxwfnfozvsrtkjprepggxrpnrvystmwcysyycqpevikeffmznimkkasvwsrenzkycxfxtlsgypsfadpooefxzbcoejuvpvaboygpoeylfpbnpljvrvipyamyehwqnqrqpmxujjloovaowuxwhmsncbxcoksfzkvatxdknlyjyhfixjswnkkufnuxxzrzbmnmgqooketlyhnkoaugzqrcddiuteiojwayyzpvscmpsajlfvgubfaaovlzylntrkdcpwsrtesjwhdizcobzcnfwlqijtvdwvxhrcbldvgylwgbusbmborxtlhcsmpxohgmgnkeufdxotogbgxpeyanfetcukepzshkljugggekjdqzjenpevqgxiepjsrdzjazujllchhbfqmkimwzobiwybxduunfsksrsrtekmqdcyzjeeuhmsrqcozijipfioneeddpszrnavymmtatbdzqsoemuvnpppsuacbazuxmhecthlegrpunkdmbppweqtgjoparmowzdqyoxytjbbhawdydcprjbxphoohpkwqyuhrqzhnbnfuvqnqqlrzjpxiogvliexdzuzosrkrusvojbrzmwzpowkjilefraamdigpnpuuhgxpqnjwjmwaxxmnsnhhlqqrzudltfzotcjtnzxuglsdsmzcnockvfajfrmxothowkbjzwucwljfrimpmyhchzriwkbarxbgfcbceyhjugixwtbvtrehbbcpxifbxvfbcgkcfqckcotzgkubmjrmbsztsshfroefwsjrxjhguzyupzwweiqurpixiqflduuveoowqcudhnefnjhaimuczfskuiduburiswtbrecuykabfcvkdzeztoidukuhjzefczzzbfkqdpqzikfobucdhthxdjgkjelrlpaxamceroswitdptpcclifkeljytihrcqaybnefxnxvgzedyyhngycdrudmphmeckotrwospofghfozqvlqfxwwkmfxdyygmdcaszsgovsodkjghcwmbmxrmhuyfyqgajqkcklznayxqkqoyzwmyubzazcpkhktkydzivcuypurfmbisgekyrgzvxdhpoamvafyrarxsvkhtqdihersigbhzjzujxmmyspnaraewkegjccvhhrjvbjtsqdjootgpknfpfycgfieowqrwwwpzsqmetogepspxnvjiupalyynmkmnuvklhsecdwracgfmzkgipdfodkjmjqwiqpuoqhimvfvuzwyvijgfullkjduhsjafbtlkmfqrmyjfjnhhssqctydteamdcjbprhtnegyiwxgcjwlgrsmeaearwtvjsjbaoiojlwhypnvruihoswkifygtydhacwyhsgewzmtgonzltjhgauhnihreqgjfwkjsmtpjhaefqzaauldrchjccdyrfvvrivuyeegfivdrcygurqdredakubnfguproqylobcwqxkzmausjgmhcmhgdnmphnqkamhurktrffaclvgrzkkldacllteojomonxrqyjzginrnnzwacxxaedrwudxzrfusewjtboxvynfhkstcenaumnddxfdmvzcautdcckxaaydzsxttobbgqngvvpjgojoglmkxgbfcpypckqchbddzwrxbzmqrlxvobtwhxginfgfrcclmznmjugwwbsqfcihubsjollmsqsghmcphelsotflbgsfnpcuzsrupchynvzhcpqugriwniqxdfjpwpxfblkpnpeelfjmtkuqpzomwnlmbupmktlptndmpdsydsgvfpenemwborifsuqhceskmkhssmvnonwafxwhgbibabvqopqfoviussqfqwehtxdzujtlntxmrjxxwtlggkytbiolydnilqadojskkvfxahhjmbocljarintdwcldvdxropbyjzwyyojuothwmlvrglfzdzdbtubxuoffvncrswsaznmoijoivvgobqpnckwvnhkebmtdhvygkjisuxhatmuudqbhmknhfxaxqxkjlzzqtsjfaeedfuujkolxjoqkdvfepvlhvhrwtfdukxffjpsswyxlijjhevryxozbafpfmowgrgonuatdqlahyggyljddjhmltedzlodsrkeutgtnkntarjkpxinovgzdthunwooxvjjmpsvknhkwjopmmlebksucvzqlyqnwcmbvbhrmlowpjbwyvwtgtoqnmicxapzarknnxtuufarzrosdqwsmtcjghecqudosrtjxyaaykqrxycrxuwjxnpqjnbkcpdmokalxapemvbqlzsvxzkutappwgzpdpyzkzcvbntcvfxsxpjaoxtfhvxxytgokrcxaetauqgndmphwzyiayabjrqgeppxyjsttyzuvldvybsuxkbmfzvrtnovidznpghozvafmsnsnqivmvubcwtfsrqtmknepbhowejazhkwcmmtpixxxlzqysxtwwtaidyaxyqleprxibexxyfvsddygthcuyyfwpjsfybglgzmbintattnhodtonpyzwotkgnguphpkxeatowzabsdnvqhkfcmofisfrfqgvpmvorpjfzslzmpjjnehrykxjzubuacclfkcyzobghtuoxrajvprecwgxxpswcgmmvedewdmfnqwcuqdsciliqecihluilgmfcswtwkkxlcbhqkvcswjebkrjlpgfgratzbsguvzifnhyxwjsjavwauxpannamxjdvzuhnaczyhepwzolhuslrkvwpnvgzmiizwudwdfzlktbqdxgyyiudsjvezkmesbjlkyertahnexhuqmjicbmusqdklasolwjxptxxeumzfwyucpabqseffunqpkfnnbecbbcjpdyjlibitllplxelrdkexdtquvptteyhtlqlbbbvoqozkynayyrbaqmyjhzxndsiyfsexwbioewqvqrtcdlpqmvjifvgymkgotzjmnzqtmrpndevnmthjitsspaqnjrdoyjwpyatmleyqsvkpamsvbmvxrllivfedkjigavyxjveqvrbacuigaipyhbbxipbzncwhrblirizxoqptqqweaafjeqiozpyfauuqmvhxkmnxmsyamptlzanotlslwuhtfqjrrwbwhmqhzkhdkcrfvbeiyipvfvpzhyujabtqwwtbkdogkemhibyxrnxsxrzletbqexkrqoiernaplqyjpqoubvjsebalwnksvloidzfpirwycztwzzvewxotakudkpedupkczlhwuskdnevdcplbklpjmpfdcyqtrcvvvtrffvpekkqmcupryjauteuvczvicthrxsxclprgdlwxfaigayrueicufdiamhtkbxotdirxxgvzqmeyrovfichqnivfjzauqfdftgmopsrgpugxtuhlcvspihazrssfszwxbqm";
		String T = "rwmxcdbhumrgjqmvnkyrtn";
		System.out.println(dpHelper(S,T));
	}
	static long dpHelper(String s, String t){
        long[][] result = new long[s.length()+1][t.length()+1];
        
        if(s.length()<t.length()){
            return 0;
        }
    for(int j = 0 ; j <= t.length();j++){

        for(int i = 0 ; i <=s.length();i++){
                if(j==0){
                    result[i][j] = 1;
                }else if(i==0){
                    result[i][j] = 0;
                }else if(s.charAt(i-1)==t.charAt(j-1)){
                    result[i][j] = result[i-1][j-1]+result[i-1][j];
                }else{
                    result[i][j] = result[i-1][j];
                }
            }
            
        }
        
//         for(int i = 0 ; i <=700;i++){
//             for(int j = 0 ; j <= t.length();j++){
//                
//                     System.out.print(result[i][j] +" ");
//                
//             }
//             System.out.println();
//         }
        
        return result[s.length()][t.length()];
}
}

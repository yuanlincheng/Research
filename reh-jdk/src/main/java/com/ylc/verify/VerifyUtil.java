package com.ylc.verify;

/**
 * 文件名：
 * 作者：Administrator
 * 时间：2017/7/22
 * 描述：8
 * 版权：亚略特
 */
public class VerifyUtil {
    public static void main(String[] args) {
//        String[] array = {"1","2","3","4","5","6","7","8","9","10","1","3","2","4","6","5","8","7","10","9"};
//        int[] array = {1,2,3,4,5,6,7,8,9,10,1,3,2,4,6,5,8,7,10,9};
        int[] array = {300,120,160,6,5,5,5,5,5,5,50,100,40,6,5,5,5,5,5,5};
        System.out.println(VerifyUtil.verify(array));
    }
    public static int verify(int[] tempArray){
        int result = 10;
        int count = tempArray.length / 10 - 1;
        for (int i = count; i > 0; i--) {
            int totalScore = 0;
            int maxScoreNum = 0;
            int limitScoreNum = 0;
            int j = 0;
            while (j < 10){
                if(tempArray[j] != 5 && tempArray[j + (10 * count)] != 5){
                    int score = Math.abs(tempArray[j] - tempArray[j + (10 * count)]);
                    if(score > 300){
                        maxScoreNum++;
                    }else if(score > 200){
                        limitScoreNum++;
                    }
                    totalScore += score;
                    j++;
                }else{
                    j++;
                    continue;
                }
                System.out.println(maxScoreNum>300);
                System.out.println(limitScoreNum > 200);
                System.out.println(totalScore/(j) > 80);
                if(maxScoreNum > 300 || limitScoreNum > 200){
                    result = 10;
                    break;
                }else if(j >= 4 && totalScore/(j) > 80){
                    result = 10;
                    break;
                }else{
                    result = Integer.parseInt("1" + count);
                    continue;
                }
            }
        }
        return result;
    }
}

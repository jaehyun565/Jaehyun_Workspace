package SWexpert_04_String;

import java.util.HashMap;
import java.util.Map;

public class Solution_1213_String_ChatGpt버전 {

    public static int boyerMoore(String text, String pattern) {
        int m = pattern.length();
        int n = text.length();

        // 패턴 내의 문자에 대한 불일치 테이블 생성
        Map<Character, Integer> skip = new HashMap<>();
        for (int i = 0; i < m - 1; i++) {
            skip.put(pattern.charAt(i), m - i - 1);
        }

        int count = 0;
        int i = m - 1;  // 텍스트 인덱스
        while (i < n) {
            int j = m - 1;  // 패턴 인덱스
            int k = i;  // 텍스트 인덱스

            // 끝에서부터 비교하면서 일치하는 부분 찾기
            while (j >= 0 && text.charAt(k) == pattern.charAt(j)) {
                j--;
                k--;
            }

            // 패턴이 일치하는 경우
            if (j == -1) {
                count++;
                i += m;  // 다음 패턴 검색을 위해 인덱스 이동
            } else {
                // 불일치 시 텍스트 인덱스를 올바르게 이동
                if (skip.containsKey(text.charAt(i))) {
                    i += skip.get(text.charAt(i));
                } else {
                    i += m;
                }
            }
        }

        return count;
    }

    public static void main(String[] args) {
        String text = "Theaimofthisstudywastofindtypologyoffashion-relatedmobileapplicationsthroughexploratoryinvestigationandtoinvestigatedifferencesinKoreaandU.S.Appstores.Andthen,throughthequalitativeevaluationaboutfashionmobileapplications,thisstudyproposesfashionmobileapplication'sdesignandcontentswhichcanbepreferredbyusers.Byconductingkeywordsearchineachstore,122Koreanapplicationsand150USapplicationswereanalyzed.Empiricalfindingsrevealedthatthereweresevenmajortypesoffashionmobileapplications:brand,magazine,information,SNS,game,shoppingandcoordination.Informationtypeapplicationstookupthelargestportion,andSNSandgametypeapplicationsshowedhigherrankingamongcustomers";
        String pattern = "as";

        int occurrences = boyerMoore(text, pattern);
        System.out.println("패턴 '" + pattern + "'이(가) 문자열에서 " + occurrences + "번 등장합니다.");
    }
}

package tms.homework.lesson12file;

import tms.homework.lesson12file.utils.CalculateLetterOfFileUtil;

import java.nio.file.Paths;

public class TestCalculateLetterUtil {

    public static void main(String[] args) {

        CalculateLetterOfFileUtil.writeResultIntoFile(Paths.get("resources", "lesson12file", "FileForCountLetter.txt").toFile());

    }
}

/*Given a positive integer, return its corresponding column title as appear in an Excel sheet.

For example:

    1 -> A
    2 -> B
    3 -> C
    ...
    26 -> Z
    27 -> AA
    28 -> AB 
Credits:
Special thanks to @ifanchu for adding this problem and creating all test cases.

Hide Company Tags Microsoft Facebook Zenefits
Hide Tags Math
Hide Similar Problems (E) Excel Sheet Column Number
 */
public class ExcelSheetColumnTitle168 {
	public String convertToTitle(int n) {
		if (n <= 0) {
			return "";
		}
		StringBuilder sb = new StringBuilder();
		while (n > 0) {
			n--;
			int temp = n % 26;
			sb.insert(0, (char) (temp + 'A'));
			n = n / 26;
		}

		return sb.toString();

	}
}

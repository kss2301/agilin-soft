package diff;

import java.util.LinkedList;

import diff.core.Diff_match_patch;
import diff.core.Diff_match_patch.Diff;
import diff.file.FileManager;
import diff.process.DiffProcess;

public class DiffMatchMain {

	public static void main(String[] args) {
		
		DiffProcess process = new DiffProcess();
		process.start();
	}
	
}

/**
 * @to-do �ѱۿ� ������ ��ó�� �ʿ�!!
 * �ٹ�ȣ�� �̻��ϰ� ����!!
 * �ѱ�.hml ������ �����Ҷ� .hml ����� ����� ����, �׻� �����ؿͼ� true �� �����Ұ�!!
 */

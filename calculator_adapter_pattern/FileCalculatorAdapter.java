package calculator_adapter_pattern;

import java.io.File;

import com.codegym.FileUtil;

public class FileCalculatorAdapter implements FileCalculator {
	@Override
	public long calculateSize(String path) {
		FileUtil fileUtil = new FileUtil();
		File file = new File(path);
		return fileUtil.calculateSize(file);
	}
}

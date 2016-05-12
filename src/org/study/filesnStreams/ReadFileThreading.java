package org.study.filesnStreams;

public class ReadFileThreading implements Runnable {

	FileDto fileDto;

	public FileDto getFileDto() {
		return fileDto;
	}

	public void setFileDto(FileDto fileDto) {
		this.fileDto = fileDto;
	}

	public void run() {
		synchronized (fileDto) {
			while (fileDto.getScanner().hasNext())
				System.out.println(fileDto.getScanner().next());
		}
	}
}

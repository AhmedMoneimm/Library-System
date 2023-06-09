package backend;

import java.time.LocalDate;

public class StudentBook implements Record{

    private final String studentid;
    private final String bookid;
    private final LocalDate borrowDate;

    public StudentBook(String studentId, String bookId, LocalDate borrowDate){
        this.studentid=studentId;
        this.bookid=bookId;
        this.borrowDate=borrowDate;
    }

    public String getStudentId(){
        return this.studentid;
    }

    public String getBookId(){
        return this.bookid ;
    }

    public LocalDate getBorrowDate(){
        return this.borrowDate;
    }

    @Override
    public String lineRepresentation(){
        return studentid+","+bookid+","+borrowDate;
    }

    @Override
    public String getSearchKey(){
        return studentid+","+bookid;
    }

    @Override
    public String getpassword() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
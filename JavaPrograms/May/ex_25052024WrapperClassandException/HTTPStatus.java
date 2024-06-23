package ex_25052024WrapperClassandException;

public class HTTPStatus {
	public static void main(String[] args) {
		
		HTTPStatuscode h1=HTTPStatuscode.OK;
		System.out.println(h1.getCode()+" "+h1.getMessage());
		
		
		
	}

}
enum HTTPStatuscode{
    OK(200, "OK"),
    CREATED(201, "Created"),
    ACCEPTED(202, "Accepted"),
    NO_CONTENT(204, "No Content"),
    BAD_REQUEST(400, "Bad Request"),
    UNAUTHORIZED(401, "Unauthorized"),
    FORBIDDEN(403, "Forbidden"),
    NOT_FOUND(404, "Not Found"),
    INTERNAL_SERVER_ERROR(500, "Internal Server Error");


    private int code;
    private String message;

    HTTPStatuscode(int code, String message) {
		// TODO Auto-generated constructor stub
    	this.code=code;
    	this.message=message;
	}

	public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    


}

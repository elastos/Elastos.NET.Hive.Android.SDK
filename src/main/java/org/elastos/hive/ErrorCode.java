package org.elastos.hive;

interface  ErrorCode {
	int BAD_REQUEST = 400;
	int UNAUTHORIZED = 401;
	int PAYMENT_REQUIRED = 402;
	int FORBIDDEN = 403;
	int NOT_FOUND = 404;
	int METHOD_NOT_ALLOWED = 405;
	int NOT_ACCEPTABLE = 406;
	int LOCKED = 423;
	int CHECKSUM_FAILED = 452;
	int NOT_ENOUGH_SPACE = 452;

	int INTERNAL_SERVER_ERROR = 500;
	int NOT_IMPLEMENTED = 501;
	int SERVICE_UNAVAILABLE = 503;
	int INSUFFICIENT_STORAGE = 507;
}

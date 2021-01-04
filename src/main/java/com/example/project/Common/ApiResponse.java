package com.example.project.Common;

public class ApiResponse {
    private Integer status;
    private Object data;
    private Object error;

    public ApiResponse() {
        this.status = this.status;
        this.data = this.data;
        this.error = this.error;
    }

    public Integer getStatus() {
        return this.status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Object getData() {
        return this.data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public Object getError() {
        return this.error;
    }

    public void setError(Object error) {
        this.error = error;
    }
}


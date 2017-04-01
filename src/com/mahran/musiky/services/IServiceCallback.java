package com.mahran.musiky.services;

public interface IServiceCallback<T> {
	void onSuccess(T result);

	void onFailure(String failureReason);
}

using org.ldk.impl;
using org.ldk.enums;
using org.ldk.util;
using System;

namespace org { namespace ldk { namespace structs {

public class Result_ThirtyTwoBytesPaymentSendFailureZ : CommonBase {
	Result_ThirtyTwoBytesPaymentSendFailureZ(object _dummy, long ptr) : base(ptr) { }
	~Result_ThirtyTwoBytesPaymentSendFailureZ() {
		if (ptr != 0) { bindings.CResult_ThirtyTwoBytesPaymentSendFailureZ_free(ptr); }
	}

	internal static Result_ThirtyTwoBytesPaymentSendFailureZ constr_from_ptr(long ptr) {
		if (bindings.CResult_ThirtyTwoBytesPaymentSendFailureZ_is_ok(ptr)) {
			return new Result_ThirtyTwoBytesPaymentSendFailureZ_OK(null, ptr);
		} else {
			return new Result_ThirtyTwoBytesPaymentSendFailureZ_Err(null, ptr);
		}
	}
	public class Result_ThirtyTwoBytesPaymentSendFailureZ_OK : Result_ThirtyTwoBytesPaymentSendFailureZ {
		public readonly byte[] res;
		internal Result_ThirtyTwoBytesPaymentSendFailureZ_OK(object _dummy, long ptr) : base(_dummy, ptr) {
			long res = bindings.CResult_ThirtyTwoBytesPaymentSendFailureZ_get_ok(ptr);
			byte[] res_conv = InternalUtils.decodeUint8Array(res);
			this.res = res_conv;
		}
	}

	public class Result_ThirtyTwoBytesPaymentSendFailureZ_Err : Result_ThirtyTwoBytesPaymentSendFailureZ {
		public readonly PaymentSendFailure err;
		internal Result_ThirtyTwoBytesPaymentSendFailureZ_Err(object _dummy, long ptr) : base(_dummy, ptr) {
			long err = bindings.CResult_ThirtyTwoBytesPaymentSendFailureZ_get_err(ptr);
			org.ldk.structs.PaymentSendFailure err_hu_conv = org.ldk.structs.PaymentSendFailure.constr_from_ptr(err);
			if (err_hu_conv != null) { err_hu_conv.ptrs_to.AddLast(this); };
			this.err = err_hu_conv;
		}
	}

	/**
	 * Creates a new CResult_ThirtyTwoBytesPaymentSendFailureZ in the success state.
	 */
	public static Result_ThirtyTwoBytesPaymentSendFailureZ ok(byte[] o) {
		long ret = bindings.CResult_ThirtyTwoBytesPaymentSendFailureZ_ok(InternalUtils.encodeUint8Array(InternalUtils.check_arr_len(o, 32)));
		GC.KeepAlive(o);
		if (ret >= 0 && ret <= 4096) { return null; }
		Result_ThirtyTwoBytesPaymentSendFailureZ ret_hu_conv = Result_ThirtyTwoBytesPaymentSendFailureZ.constr_from_ptr(ret);
		return ret_hu_conv;
	}

	/**
	 * Creates a new CResult_ThirtyTwoBytesPaymentSendFailureZ in the error state.
	 */
	public static Result_ThirtyTwoBytesPaymentSendFailureZ err(org.ldk.structs.PaymentSendFailure e) {
		long ret = bindings.CResult_ThirtyTwoBytesPaymentSendFailureZ_err(e.ptr);
		GC.KeepAlive(e);
		if (ret >= 0 && ret <= 4096) { return null; }
		Result_ThirtyTwoBytesPaymentSendFailureZ ret_hu_conv = Result_ThirtyTwoBytesPaymentSendFailureZ.constr_from_ptr(ret);
		return ret_hu_conv;
	}

	/**
	 * Checks if the given object is currently in the success state
	 */
	public bool is_ok() {
		bool ret = bindings.CResult_ThirtyTwoBytesPaymentSendFailureZ_is_ok(this.ptr);
		GC.KeepAlive(this);
		return ret;
	}

	internal long clone_ptr() {
		long ret = bindings.CResult_ThirtyTwoBytesPaymentSendFailureZ_clone_ptr(this.ptr);
		GC.KeepAlive(this);
		return ret;
	}

	/**
	 * Creates a new CResult_ThirtyTwoBytesPaymentSendFailureZ which has the same data as `orig`
	 * but with all dynamically-allocated buffers duplicated in new buffers.
	 */
	public Result_ThirtyTwoBytesPaymentSendFailureZ clone() {
		long ret = bindings.CResult_ThirtyTwoBytesPaymentSendFailureZ_clone(this.ptr);
		GC.KeepAlive(this);
		if (ret >= 0 && ret <= 4096) { return null; }
		Result_ThirtyTwoBytesPaymentSendFailureZ ret_hu_conv = Result_ThirtyTwoBytesPaymentSendFailureZ.constr_from_ptr(ret);
		return ret_hu_conv;
	}

}
} } }

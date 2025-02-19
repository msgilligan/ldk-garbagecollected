package org.ldk.structs;

import org.ldk.impl.bindings;
import org.ldk.enums.*;
import org.ldk.util.*;
import java.util.Arrays;
import java.lang.ref.Reference;
import javax.annotation.Nullable;

public class Result_NoneReplayEventZ extends CommonBase {
	private Result_NoneReplayEventZ(Object _dummy, long ptr) { super(ptr); }
	protected void finalize() throws Throwable {
		if (ptr != 0) { bindings.CResult_NoneReplayEventZ_free(ptr); } super.finalize();
	}

	protected void force_free() {
		if (ptr != 0) { bindings.CResult_NoneReplayEventZ_free(ptr); ptr = 0; }
	}

	static Result_NoneReplayEventZ constr_from_ptr(long ptr) {
		if (bindings.CResult_NoneReplayEventZ_is_ok(ptr)) {
			return new Result_NoneReplayEventZ_OK(null, ptr);
		} else {
			return new Result_NoneReplayEventZ_Err(null, ptr);
		}
	}
	public static final class Result_NoneReplayEventZ_OK extends Result_NoneReplayEventZ {
		private Result_NoneReplayEventZ_OK(Object _dummy, long ptr) {
			super(_dummy, ptr);
		}
	}

	public static final class Result_NoneReplayEventZ_Err extends Result_NoneReplayEventZ {
		public final ReplayEvent err;
		private Result_NoneReplayEventZ_Err(Object _dummy, long ptr) {
			super(_dummy, ptr);
			long err = bindings.CResult_NoneReplayEventZ_get_err(ptr);
			org.ldk.structs.ReplayEvent err_hu_conv = null; if (err < 0 || err > 4096) { err_hu_conv = new org.ldk.structs.ReplayEvent(null, err); }
			if (err_hu_conv != null) { err_hu_conv.ptrs_to.add(this); };
			this.err = err_hu_conv;
		}
	}

	/**
	 * Creates a new CResult_NoneReplayEventZ in the success state.
	 */
	public static Result_NoneReplayEventZ ok() {
		long ret = bindings.CResult_NoneReplayEventZ_ok();
		if (ret >= 0 && ret <= 4096) { return null; }
		Result_NoneReplayEventZ ret_hu_conv = Result_NoneReplayEventZ.constr_from_ptr(ret);
		return ret_hu_conv;
	}

	/**
	 * Creates a new CResult_NoneReplayEventZ in the error state.
	 */
	public static Result_NoneReplayEventZ err(org.ldk.structs.ReplayEvent e) {
		long ret = bindings.CResult_NoneReplayEventZ_err(e.ptr);
		Reference.reachabilityFence(e);
		if (ret >= 0 && ret <= 4096) { return null; }
		Result_NoneReplayEventZ ret_hu_conv = Result_NoneReplayEventZ.constr_from_ptr(ret);
		return ret_hu_conv;
	}

	/**
	 * Checks if the given object is currently in the success state
	 */
	public boolean is_ok() {
		boolean ret = bindings.CResult_NoneReplayEventZ_is_ok(this.ptr);
		Reference.reachabilityFence(this);
		return ret;
	}

	long clone_ptr() {
		long ret = bindings.CResult_NoneReplayEventZ_clone_ptr(this.ptr);
		Reference.reachabilityFence(this);
		return ret;
	}

	/**
	 * Creates a new CResult_NoneReplayEventZ which has the same data as `orig`
	 * but with all dynamically-allocated buffers duplicated in new buffers.
	 */
	public Result_NoneReplayEventZ clone() {
		long ret = bindings.CResult_NoneReplayEventZ_clone(this.ptr);
		Reference.reachabilityFence(this);
		if (ret >= 0 && ret <= 4096) { return null; }
		Result_NoneReplayEventZ ret_hu_conv = Result_NoneReplayEventZ.constr_from_ptr(ret);
		return ret_hu_conv;
	}

}

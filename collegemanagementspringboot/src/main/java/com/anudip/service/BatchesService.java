package com.anudip.service;

import com.anudip.entity.Batches;

public interface BatchesService {
	
	Batches addBatchesDetail (Batches batches);

	Batches getBatchesDeatil(int bid);

	Batches updateBatchesDetail(Batches batches, int bid);

	Batches deleteBatchesDetail(int bid);

}

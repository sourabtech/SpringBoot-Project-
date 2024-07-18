package com.anudip.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.anudip.entity.Batches;
import com.anudip.exception.BatchesNotFoundException;
import com.anudip.ripository.BatchesRepository;
import com.anudip.service.BatchesService;

@Service
public class BatchesServiceImpl implements BatchesService{

	@Autowired
	BatchesRepository brepo;
	
	@Override
	public Batches addBatchesDetail(Batches batches) {
		// TODO Auto-generated method stub
		return brepo.save(batches);
	}

	@Override
	public Batches getBatchesDeatil(int bid) {
		// TODO Auto-generated method stub
		return brepo.findById(bid).orElseThrow(()->new BatchesNotFoundException("batches Id not correct"));
	}

	@Override
	public Batches updateBatchesDetail(Batches batches, int bid) {
		// TODO Auto-generated method stub
		Batches bat = brepo.findById(bid)
                .orElseThrow(() -> new BatchesNotFoundException("courses with ID " + bid + " not found"));
		bat.setBid(bat.getBid());
		bat.setBname(bat.getBname());
		bat.setDuration(bat.getDuration());
		bat.setEnddate(bat.getEnddate());
		bat.setStartdate(bat.getStartdate());
		bat.setSubject(bat.getSubject());
        return brepo.save(bat);

	}

	@Override
	public Batches deleteBatchesDetail(int bid) {
		// TODO Auto-generated method stub
		 Batches batches = brepo.findById(bid)
	                .orElseThrow(() -> new BatchesNotFoundException("batches Id not found"));
	        brepo.delete(batches);
			return batches;	}

}

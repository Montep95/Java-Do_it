package chapter10_scheduler;

public class PriorityAllocation implements Scheduler
{

	@Override
	public void getNextCall() {
		System.out.println("상담전화를 순서대로 대기열에서 가져옵니다.");
	}

	@Override
	public void sendCalToAgent() {
		System.out.println("업무 스킬이 가장높은 상담원의 대기열에 우선 배분합니다.");
	}
	
}

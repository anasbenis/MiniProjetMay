package question2;

import compClientDefQ2.InitPrint;

public class InitPrintImpl extends InitPrint {

	@Override
	protected AnnounceInit make_announceService() {
		// TODO Auto-generated method stub
		return new AnnounceInit(){

			@Override
			public void startProcessFor(String subject) {
				String msg="d�but du processus d��valuation pour le candidat : "+subject;
				requires().printingService().requestToPrint(msg);
			}
			
		};
	}

}

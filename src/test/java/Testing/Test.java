package Testing;


import MediaWiki.HttpCallActions;
import PojoClasses.All.Selected0;
import com.google.gson.Gson;

import java.io.IOException;

public class Test {

    public static void main(String[] args) throws IOException {
        HttpCallActions message = new HttpCallActions();
//        var json = message.get("https://api.wikimedia.org/feed/v1/wikipedia/en/onthisday/all/05/02");

        var json = """
                {
                    "selected": [
                        {
                            "text": "Two mudslides in Badakhshan Province, Afghanistan, killed at least 350 people.",
                            "pages": [
                                {
                                    "type": "standard",
                                    "title": "2014_Badakhshan_mudslides",
                                    "displaytitle": "2014 Badakhshan mudslides",
                                    "namespace": {
                                        "id": 0,
                                        "text": ""
                                    },
                                    "wikibase_item": "Q16743981",
                                    "titles": {
                                        "canonical": "2014_Badakhshan_mudslides",
                                        "normalized": "2014 Badakhshan mudslides",
                                        "display": "2014 Badakhshan mudslides"
                                    },
                                    "pageid": 42648133,
                                    "thumbnail": {
                                        "source": "https://upload.wikimedia.org/wikipedia/commons/thumb/5/53/Badakhshan_in_Afghanistan.svg/320px-Badakhshan_in_Afghanistan.svg.png",
                                        "width": 320,
                                        "height": 236
                                    },
                                    "originalimage": {
                                        "source": "https://upload.wikimedia.org/wikipedia/commons/thumb/5/53/Badakhshan_in_Afghanistan.svg/1807px-Badakhshan_in_Afghanistan.svg.png",
                                        "width": 1807,
                                        "height": 1331
                                    },
                                    "lang": "en",
                                    "dir": "ltr",
                                    "revision": "1085678027",
                                    "tid": "97685c90-c992-11ec-95c8-c35735af9c06",
                                    "timestamp": "2022-05-01T21:06:35Z",
                                    "description": "Mudslides in Afghanistan",
                                    "description_source": "local",
                                    "coordinates": {
                                        "lat": 37.01583333,
                                        "lon": 70.36388889
                                    },
                                    "content_urls": {
                                        "desktop": {
                                            "page": "https://en.wikipedia.org/wiki/2014_Badakhshan_mudslides",
                                            "revisions": "https://en.wikipedia.org/wiki/2014_Badakhshan_mudslides?action=history",
                                            "edit": "https://en.wikipedia.org/wiki/2014_Badakhshan_mudslides?action=edit",
                                            "talk": "https://en.wikipedia.org/wiki/Talk:2014_Badakhshan_mudslides"
                                        },
                                        "mobile": {
                                            "page": "https://en.m.wikipedia.org/wiki/2014_Badakhshan_mudslides",
                                            "revisions": "https://en.m.wikipedia.org/wiki/Special:History/2014_Badakhshan_mudslides",
                                            "edit": "https://en.m.wikipedia.org/wiki/2014_Badakhshan_mudslides?action=edit",
                                            "talk": "https://en.m.wikipedia.org/wiki/Talk:2014_Badakhshan_mudslides"
                                        }
                                    },
                                    "extract": "On 2 May 2014, a pair of mudslides occurred in Argo District, Badakhshan Province, Afghanistan. The death toll is uncertain, the number of deaths varying from 350 to 2,700. Around 300 houses were buried and over 14,000 were affected. Rescuers responding to the initial mudslide were struck by a second mudslide, which hampered rescue efforts.",
                                    "extract_html": "<p>On 2 May 2014, a pair of mudslides occurred in Argo District, Badakhshan Province, Afghanistan. The death toll is uncertain, the number of deaths varying from 350 to 2,700. Around 300 houses were buried and over 14,000 were affected. Rescuers responding to the initial mudslide were struck by a second mudslide, which hampered rescue efforts.</p>",
                                    "normalizedtitle": "2014 Badakhshan mudslides"
                                },
                                {
                                    "type": "standard",
                                    "title": "Badakhshan_Province",
                                    "displaytitle": "Badakhshan Province",
                                    "namespace": {
                                        "id": 0,
                                        "text": ""
                                    },
                                    "wikibase_item": "Q165376",
                                    "titles": {
                                        "canonical": "Badakhshan_Province",
                                        "normalized": "Badakhshan Province",
                                        "display": "Badakhshan Province"
                                    },
                                    "pageid": 1282198,
                                    "thumbnail": {
                                        "source": "https://upload.wikimedia.org/wikipedia/commons/thumb/5/59/Badakhshan_province_of_Afghanistan.jpg/320px-Badakhshan_province_of_Afghanistan.jpg",
                                        "width": 320,
                                        "height": 226
                                    },
                                    "originalimage": {
                                        "source": "https://upload.wikimedia.org/wikipedia/commons/5/59/Badakhshan_province_of_Afghanistan.jpg",
                                        "width": 1024,
                                        "height": 724
                                    },
                                    "lang": "en",
                                    "dir": "ltr",
                                    "revision": "1085551817",
                                    "tid": "6ba10690-c904-11ec-b038-c12174773855",
                                    "timestamp": "2022-05-01T04:08:52Z",
                                    "description": "Province of Afghanistan",
                                    "description_source": "local",
                                    "coordinates": {
                                        "lat": 38,
                                        "lon": 71
                                    },
                                    "content_urls": {
                                        "desktop": {
                                            "page": "https://en.wikipedia.org/wiki/Badakhshan_Province",
                                            "revisions": "https://en.wikipedia.org/wiki/Badakhshan_Province?action=history",
                                            "edit": "https://en.wikipedia.org/wiki/Badakhshan_Province?action=edit",
                                            "talk": "https://en.wikipedia.org/wiki/Talk:Badakhshan_Province"
                                        },
                                        "mobile": {
                                            "page": "https://en.m.wikipedia.org/wiki/Badakhshan_Province",
                                            "revisions": "https://en.m.wikipedia.org/wiki/Special:History/Badakhshan_Province",
                                            "edit": "https://en.m.wikipedia.org/wiki/Badakhshan_Province?action=edit",
                                            "talk": "https://en.m.wikipedia.org/wiki/Talk:Badakhshan_Province"
                                        }
                                    },
                                    "extract": "Badakhshan Province is one of the 34 provinces of Afghanistan, located in the northeastern part of the country. It is bordered by Tajikistan's Gorno-Badakhshan in the north and the Pakistan-administered Lower and Upper Chitral and Gilgit-Baltistan in the southeast. It also has a 91-kilometer (57-mile) border with China in the east.",
                                    "extract_html": "<p><b>Badakhshan Province</b> is one of the 34 provinces of Afghanistan, located in the northeastern part of the country. It is bordered by Tajikistan's Gorno-Badakhshan in the north and the Pakistan-administered Lower and Upper Chitral and Gilgit-Baltistan in the southeast. It also has a 91-kilometer (57-mile) border with China in the east.</p>",
                                    "normalizedtitle": "Badakhshan Province"
                                }
                            ],
                            "year": 2014
                        }
                    ]
                }
                """;

        Gson gson = new Gson();
        var obj = gson.fromJson(json, Selected0.class);

        System.out.println(obj.getSelected().getText());
    }
}
